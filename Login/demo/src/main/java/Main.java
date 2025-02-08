public class Project3 extends Application{
    @Override
    public void start(Stage stage) throws Exception{
        Parent root=FXMLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    ///hhh
    public sattic void main(String[] args){
        launch(args);
    }
}