package hw30.deadlock;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter

public class Stone {
    private Bridge bridge;
    public synchronized String getString(){
        return "String Bridge";
    }
    @SneakyThrows
    public synchronized String getStringFromBridge(){
        Thread.sleep(10);
        return bridge.getString();
    }
}
