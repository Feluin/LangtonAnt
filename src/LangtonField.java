public class LangtonField
{
    private Color[][] playground = new Color[1000][1000];

    public LangtonField()
    {
        for (Color[] playgroundrow :
            playground)
        {
            for (Color playgroundcell : playgroundrow)
            {
                playgroundcell = Color.White;
            }
        }
    }

    public Color getPosition(int x, int y) {
        return playground[x][y];
    }

    public void flipPosition(int x, int y) {
        playground[x][y]=playground[x][y]==Color.Black?Color.White:Color.Black;
    }

    public enum Color
    {
        White, Black
    }
    public int getHeight(){
        return playground.length;
    }

    public int getWidth(){
        return playground[0].length;
    }
    public Color[][] getPlayground()
    {
        return playground;
    }
}
