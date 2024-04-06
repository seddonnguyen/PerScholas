package module._303.hands_on_activity.lesson_14;

import java.util.List;

@FunctionalInterface
public interface Calculate {
    Number compute(List<? extends Number> numbers);
}