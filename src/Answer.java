import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Answer {
    @SerializedName("head")
    @Expose
    private Head head;
    @SerializedName("def")
    @Expose
    private List<Def> def;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public List<Def> getDef() {
        return def;
    }

    public void setDef(List<Def> def) {
        this.def = def;
    }
}

class Def {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("tr")
    @Expose
    private List<Tr> tr;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public List<Tr> getTr() {
        return tr;
    }

    public void setTr(List<Tr> tr) {
        this.tr = tr;
    }

}

class Head {

}
class Syn {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("fr")
    @Expose
    private Integer fr;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getFr() {
        return fr;
    }

    public void setFr(Integer fr) {
        this.fr = fr;
    }
}

class Tr {
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("fr")
    @Expose
    private Integer fr;
    @SerializedName("syn")
    @Expose
    private List<Syn> syn;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getFr() {
        return fr;
    }

    public void setFr(Integer fr) {
        this.fr = fr;
    }

    public List<Syn> getSyn() {
        return syn;
    }

    public void setSyn(List<Syn> syn) {
        this.syn = syn;
    }

}
