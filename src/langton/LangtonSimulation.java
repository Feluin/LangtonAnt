package langton;

import java.util.ArrayList;
import java.util.List;

public class LangtonSimulation
{
    private LangtonField langtonField;
    private List<Ant> ants=new ArrayList<>();
    public LangtonSimulation(){

    }

    public void create(int x,int y)
    {
        langtonField=new LangtonField(x,y);
    }

    public void setFieldBlack(final int x,
        final int y)
    {
        langtonField.setFieldBlack(x,y);
    }

    public void addAnt(final int x,
        final int y)
    {
        ants.add(new Ant(langtonField,x,y));
    }
    public void nextMove(){
        ants.forEach(Ant::move);
    }

    public void printCurrentState()
    {
        for(LangtonField.Color[] colorrow:langtonField.getPlayground()){
            for(LangtonField.Color color:colorrow){
                if(color== LangtonField.Color.Black){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
