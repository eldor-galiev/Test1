public class AverageTemperature {
    double [] temperatures;

    public AverageTemperature(double temperature) {
        double[] NewTemperatures = new double[temperatures.length + 1];
        if (this.temperatures.length <= 30) {
            for (int i = 0; i < temperatures.length; i++) {
                NewTemperatures[i] = temperatures[i];
            }
            NewTemperatures[temperatures.length] = temperature;
        }
        else {
            for (int i = 0; i < temperatures.length-1; i++) {
                NewTemperatures[i] = temperatures[i+1];
            }
            NewTemperatures[29] = temperature;
        }
        this.temperatures = NewTemperatures;
    }
    public double [] getTemperatureForLastWeek() {
        double [] TemperatureForLastWeek = new double[7];
        for (int i = Math.max(temperatures.length-7, 0); i < temperatures.length; i++) {
            TemperatureForLastWeek[i] = temperatures[i];
        }
        return TemperatureForLastWeek;
    }
}
