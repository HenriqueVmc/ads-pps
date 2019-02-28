package pct;

public class RobotFacade {

    private RobotBody body = null;
    private RobotColor color = null;
    private RobotMetal metal = null;
    
    public RobotFacade() {
        body = new RobotBody();
        color = new RobotColor();
        metal = new RobotMetal();
    }
    
    public void configRobot(String body, String color, String metal){
        this.body.setBody(body);
        this.color.setColor(color);
        this.metal.setMetal(metal);
    }
    
    public void printRobot(){
        this.body.getBody();
        this.color.getColor();
        this.metal.getMetal();
    }
}
