/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tmddv3verification.utilities;

/**
 *
 * @author TransCore ITS
 */
public class Variable {
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return name+": "+ value;
    }

}
