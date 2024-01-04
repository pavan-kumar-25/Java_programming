import java.util.function.BiFunction; 
import java.util.function.Function;

public class LambdaExpressionAerospace {

    // Example: Finding the minimum speed in the array
    public static void main(String[] args) {
        
        double[] speedArray = {250, 300, 355, 400, 450};
        
        // Lambda Expression for min speed
        Function<double[], Double> findMinSpeed = speeds -> {
            double minSpeed = speeds[0]; 
            for (double speed : speeds) {
                if (speed < minSpeed) {
                    minSpeed = speed;
                }
            }
            return minSpeed;
        };
        
        double minSpeed = findMinSpeed.apply(speedArray);
        System.out.println("Minimum Speed: " + minSpeed);
        
        // Lambda Expression for max speed 
        Function<double[], Double> findMaxSpeed = speeds -> {
            double maxSpeed = speeds[0];
            for (double speed : speeds) {
                if (speed > maxSpeed) {
                    maxSpeed = speed;   
                }
            }
            return maxSpeed;
        };
        
        double maxSpeed = findMaxSpeed.apply(speedArray);
        System.out.println("Maximum Speed: " + maxSpeed);
        
        // Lambda Expression to find speed in range
        BiFunction<double[], Double, Double> findSpeedInRange = 
            (speeds, lowerBound) -> {
                for(double speed : speeds) {
                    if(speed >= lowerBound) {
                        return speed;
                    }
                } 
                return -1.0;  
        };
 
        Double speed = findSpeedInRange.apply(speedArray, 350.0); 
        System.out.println("Speed >= 350: " + speed);
        
    }

}