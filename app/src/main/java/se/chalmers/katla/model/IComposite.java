package se.chalmers.katla.model;

import java.util.List;

/**
 * Created by Mattias on 2014-10-03.
 */
public interface IComposite {

    public String getText();
    public String getBaseText();
    public void setBaseText(String text);

    public void setInputs(List<String> inputs);
    public List<String> getInputs();

}
