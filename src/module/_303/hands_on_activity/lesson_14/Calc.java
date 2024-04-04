package module._303.hands_on_activity.lesson_14;

@FunctionalInterface
public interface Calc<T extends Number> {
    T compute(T[] values);
}
