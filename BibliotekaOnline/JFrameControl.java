import javax.swing.*;
import java.util.ArrayList;

public class JFrameControl {

    public ServerConnection server;
    public User user;
    public Book currentBook;

    public void PrzyciskZaloguj(){
        if(ServerConnection.S.LogIn(fieldUsernameLogin.getText(), fieldPasswordLogin.getPassword()))
        {
            jLabel1.setVisible(false);
            user=new User(fieldUsernameLogin.getText(),ServerConnection.S.IsEmployee(fieldUsernameLogin.getText()));
            ShowFrame(accountPage);
            fieldUsernameLogin.setText(null);
        }
        else{
            jLabel1.setVisible(true);
        }
        fieldUsernameLogin.setText(null);
        fieldPasswordLogin.setText(null);
    }

    public void PrzyciskZarejestruj(){
        //jeszcze sprawdzić, czy format maila jest poprawny!
        String mail=fieldMail.getText();
        boolean at=false;
        boolean dot=false;
        boolean check=true;

        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='.' && !at) check=false;
            else if(mail.charAt(i)=='.') dot=true;
            if(mail.charAt(i)=='@') at=true;
        }

        if(!at) check=false;
        if(!dot) check=false;

        int reg=server.Register(fieldUsername.getText(),fieldMail.getText(),fieldPassword.getPassword(),fieldBirthDate.getText());

        if(!check){
            jLabelUsernameTaken.setText("Niepoprawny format adresu email!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(fieldPassword!=fieldRepeatPassword) {
            jLabelUsernameTaken.setText("Hasło nie zostało powtórzone poprawnie!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(fieldMail!=fieldRepeatMail){
            jLabelUsernameTaken.setText("Adres email nie został powtórzony poprawnie!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(reg==1)
        {
            jLabelUsernameTaken.setText("Nazwa użytkownika jest zajęta! Użytkownik o podanym adresie email już istnieje!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(reg==2)
        {
            jLabelUsernameTaken.setText("Nazwa użytkownika jest zajęta!");
            jLabelUsernameTaken.setVisible(true);
        }
        else if(reg==3)
        {
            jLabelUsernameTaken.setText("Użytkownik o podanym adresie email już istnieje!");
            jLabelUsernameTaken.setVisible(true);
        }
        else
        {
            this.S.setVisible(false);
            ekranlogowania.S.setVisible(true);
            jLabelUsernameTaken.setVisible(false);
            fieldUsername.setText(null);
            fieldMail.setText(null);
            fieldPassword.setText(null);
            fieldBirthDate.setText(null);
        }
    }

    public void PrzyciskDodajRecenzje(){

        if(jTextArea.getText()==null) server.AddReview(currentBook.getTitle(), user.getUsername(), jSpinner1.getValue());
        else{
            server.AddReview(currentBook.getTitle(), user.getUsername(), jSpinner1.getValue(),jTextArea.getText());
            jTextArea.setText(null);
        }
    }

    public void PrzyciskWyszukaj(){
        ArrayList<String> ksiazki=new ArrayList<>();
        if(jRadioName.isSelected())
            ksiazki=server.SearchByAuthorsName(currentBook.getAuthor_name());
        else if(jRadioSurname.isSelected())
            ksiazki=server.SearchByAuthorsSurname(currentBook.getAuthor_surname());
        else if(jRadioTitle.isSelected())
            ksiazki=server.SearchByTitle(currentBook.getTitle());
    }

    public void DodajKsiazke(){
        ServerConnection.S.AddBook(potrzebne stringi z pól);
    }
}
