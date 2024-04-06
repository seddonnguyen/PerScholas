package module._303.hands_on_activity.Calculator;

import java.util.List;

@FunctionalInterface
public interface Calculate {
    Number compute(List<? extends Number> numbers);
}