package hw30.deadlock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bridge {
    private Stone stone;
public synchronized String getString(){
    return "String Stone";
}
public synchronized String getStringFromStone(){
    return stone.getString();
}
}
