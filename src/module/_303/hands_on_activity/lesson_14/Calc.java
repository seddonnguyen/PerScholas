package module._303.hands_on_activity.lesson_14;

@FunctionalInterface
public interface Calc<E> {
    E compute(E[] values);
}
