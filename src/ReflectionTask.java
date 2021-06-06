import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTask {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;
        String result = "class " + carClass.getName() + " {\n\n";
        for (Field field : carClass.getDeclaredFields()) {
            result += "\t" + field + ";\n";
        }
        result += "\n\t";
        for (Constructor constructor : carClass.getConstructors()) {
            result += constructor + "\n\n\t";
        }
        for (Method method : carClass.getMethods()) {
            result += method + "\n\n\t";
        }
        result += "}";
        System.out.println(result);
    }
}
