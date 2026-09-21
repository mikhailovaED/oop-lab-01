interface MovementStrategy {
    abstract void move();
}

class Walking implements MovementStrategy{
    public void move() {
        IO.println(String.format("Иду пешком!"));
    }
}

class HorseRiding implements MovementStrategy{
    public void move(){
        IO.println(String.format("Еду на лошади!"));
    }
}

class Flying implements MovementStrategy{
    public void move(){
        IO.println(String.format("Лечу!"));
    }
}