package ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class SCRUMTEAM {

        public PO PO;
        public SM SM;
        public ArrayList<Tester> testers=new ArrayList<>();
        public ArrayList<Developer>developers=new ArrayList<>();

    public SCRUMTEAM(ScrumTask.PO PO, ScrumTask.SM SM ) {
        this.PO = PO;
        this.SM = SM;

    }
    public void addTester(Tester tester){
                    //    String name
        testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int ID ){
        testers.removeIf(p-> p.ID==ID);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
}
