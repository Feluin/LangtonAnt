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

    public enum Color
    {
        White, Black
    }

    public Color[][] getPlayground()
    {
        return playground;
    }
}
