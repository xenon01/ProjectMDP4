package surya.com.projectmdp;

public class MatchesDota2 {
    public String tvTeamA,tvTeamB;
    public int imageViewA,imageViewB;

    public MatchesDota2(String tvTeamA, String tvTeamB, int imageViewA, int imageViewB) {
        this.tvTeamA = tvTeamA;
        this.tvTeamB = tvTeamB;
        this.imageViewA = imageViewA;
        this.imageViewB = imageViewB;
    }

    public String getTvTeamA() {
        return tvTeamA;
    }

    public void setTvTeamA(String tvTeamA) {
        this.tvTeamA = tvTeamA;
    }

    public String getTvTeamB() {
        return tvTeamB;
    }

    public void setTvTeamB(String tvTeamB) {
        this.tvTeamB = tvTeamB;
    }

    public int getImageViewA() {
        return imageViewA;
    }

    public void setImageViewA(int imageViewA) {
        this.imageViewA = imageViewA;
    }

    public int getImageViewB() {
        return imageViewB;
    }

    public void setImageViewB(int imageViewB) {
        this.imageViewB = imageViewB;
    }
}
