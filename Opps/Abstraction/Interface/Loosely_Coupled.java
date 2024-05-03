package Abstraction.Interface;


interface Keybord {
    String display();
}

class DellKeyword implements Keybord {
    String info;

    public String display() {
        this.info = "THis is DellKeybord";
        return info;
    }
}

class HPKeyword implements Keybord {
    String info;

    public String display() {
        this.info = "THis is HPKeybord";
        return info;
    }
}

class VivoKeyword implements Keybord {
    String info;

    public String display() {
        this.info = "THis is VivoKeybord";
        return info;
    }
}

public class Loosely_Coupled {
//    public void keybordUsed(DellKeyword p) {
//        System.out.println(p.display());
//    }
//
//    public void keybordUsed(HPKeyword p) {
//        System.out.println(p.display());
//    }

    public void keybordUsed(Keybord s) {
        System.out.println(s.display());
    }

    public static void main(String[] args) {
        Loosely_Coupled s = new Loosely_Coupled();
        DellKeyword dell = new DellKeyword();
        HPKeyword Hp = new HPKeyword();
        VivoKeyword vivo = new VivoKeyword();
        s.keybordUsed(dell);
        s.keybordUsed(Hp);
        s.keybordUsed(vivo);
    }
}
