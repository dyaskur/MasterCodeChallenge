/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mastercode;

/**
 *
 * @author muhammaddyasyaskur
 */
class MarkupElement {
private String openroot = "";
private String closeroot = "";
private String openbody ="";
private String  closebody= "";
private ItalicElement italic;
private String content = "I am italic.";
private String openingtag ="[i]";
private String closingtag = "[/i]";
void settag(String open, String close) {
        openingtag = open;
        closingtag = close;
    }
void setroot(String open, String close) {
        openroot = open;
        closeroot = close;
    }
void setbody(String open, String close) {
        openbody = open;
        closebody = close;
    }

    void setContent(String teks) {
content =teks;
    }

    public String produceOutput() {
return openroot+openbody+openingtag+content+closingtag+closebody+closeroot;
        }

    void addChildren(MarkupElement body) {
        openbody = body.openbody;
                closebody = body.closebody;
                openingtag = body.openingtag;

    }
    
}
