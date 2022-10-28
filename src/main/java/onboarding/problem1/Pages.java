package onboarding.problem1;

import java.util.List;

public class Pages {
    private final List<Integer> pageList;
    public Pages(List<Integer> pageList){
        this.pageList=pageList;
    }
    public List<Integer> getPages(){
        return this.pageList;
    }
}
