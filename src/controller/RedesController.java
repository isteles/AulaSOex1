package controller;

public class RedesController {
        
    public RedesController() {
        super();
    }
    
    public String ChamadaIP() {
        String ChamadaIP = System.getProperty("os.name");
        return ChamadaIP;
    }
    
    public void callProcess(String process) {
        try {
            Runtime.getRuntime().exec(process);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
        
}
