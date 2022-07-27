package com.attestaion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToDouble(Subject::score)
                .average()
                .orElse(0);
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, LinkedHashMap::new, Collectors.averagingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(entry -> new Label(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> new Label(pupil.name(),
                        pupil.subjects().stream()
                                .mapToDouble(Subject::score)
                                .average()
                                .orElse(0)))
                .collect(Collectors.toList());
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> new Label(pupil.name(),
                        pupil.subjects().stream()
                                .collect(Collectors.summarizingDouble(Subject::score))
                                .getSum()))
                .max(Comparator.comparing(Label::score))
                .orElse(null);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, LinkedHashMap::new, Collectors.summingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(entry -> new Label(entry.getKey(), entry.getValue()))
                .max(Comparator.comparing(Label::score))
                .orElse(null);
    }
}
