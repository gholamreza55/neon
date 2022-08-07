package verasat;

public abstract class UIControl {
    private boolean isEable = true;

//    public UIControl(boolean isEable) {
//        this.isEable = isEable;
//    }

    public abstract void render();

    public final void enable(){
        isEable = true;
    }

    public void disable(){
        isEable = false;

    }
    public boolean isEable(){
        return isEable;
    }
}
