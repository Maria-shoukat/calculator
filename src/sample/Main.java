package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Main extends Application {
    int value,value2;
    double value3;
    String str="";
    String str1;
    TextField tfDisplay;

    Button cBtn,sqrBtn,sqrtBtn,divisionBtn,sevenBtn,eightBtn,nineBtn
            ,multiplicationBtn,fourBtn,fiveBtn,sixBtn,additionBtn,oneBtn,
            twoBtn,threeBtn,minusBtn,dotBtn,zeroBtn,addSubBtn,isEqualBtn;
    HBox HB1, HB2, HB3, HB4, HB5, HB6;
    FlowPane root;

    @Override
    public void start(Stage primaryStage) throws Exception{

        tfDisplay = new TextField("0");
        tfDisplay.setPrefWidth(480);
        tfDisplay.setPrefHeight(60);
        HB1 = new HBox(20, tfDisplay);
        tfDisplay.setFont(new Font(36));
        tfDisplay.setEditable(false);
        HB1.setPadding(new Insets(30, 30, 30, 30));
        tfDisplay.setAlignment(Pos.CENTER_RIGHT);
        HB1.setAlignment(Pos.CENTER);


        cBtn=new Button("C");
        cBtn.setPrefWidth(120);
        cBtn.setPrefHeight(60);


        sqrBtn=new Button("x^2");
        sqrBtn.setPrefWidth(120);
        sqrBtn.setPrefHeight(60);



        sqrtBtn=new Button("sqrt");
        sqrtBtn.setPrefWidth(120);
        sqrtBtn.setPrefHeight(60);


        divisionBtn=new Button("/");
        divisionBtn.setPrefWidth(120);
        divisionBtn.setPrefHeight(60);

        HB2=new HBox(cBtn,sqrBtn,sqrtBtn,divisionBtn);
        HB2.setAlignment(Pos.CENTER);


        sevenBtn=new Button("7");
        sevenBtn.setPrefWidth(120);
        sevenBtn.setPrefHeight(60);


        eightBtn=new Button("8");
        eightBtn.setPrefWidth(120);
        eightBtn.setPrefHeight(60);



        nineBtn=new Button("9");
        nineBtn.setPrefWidth(120);
        nineBtn.setPrefHeight(60);



        multiplicationBtn=new Button("x");
        multiplicationBtn.setPrefWidth(120);
        multiplicationBtn.setPrefHeight(60);


        HB3=new HBox(sevenBtn,eightBtn,nineBtn,multiplicationBtn);
        HB3.setAlignment(Pos.CENTER);


        fourBtn=new Button("4");
        fourBtn.setPrefWidth(120);
        fourBtn.setPrefHeight(60);



        fiveBtn=new Button("5");
        fiveBtn.setPrefWidth(120);
        fiveBtn.setPrefHeight(60);



        sixBtn=new Button("6");
        sixBtn.setPrefWidth(120);
        sixBtn.setPrefHeight(60);



        minusBtn=new Button("-");
        minusBtn.setPrefWidth(120);
        minusBtn.setPrefHeight(60);


        HB4=new HBox(fourBtn,fiveBtn,sixBtn,minusBtn);
        HB4.setAlignment(Pos.CENTER);


        oneBtn=new Button("1");
        oneBtn.setPrefWidth(120);
        oneBtn.setPrefHeight(60);



        twoBtn=new Button("2");
        twoBtn.setPrefWidth(120);
        twoBtn.setPrefHeight(60);



        threeBtn=new Button("3");
        threeBtn.setPrefWidth(120);
        threeBtn.setPrefHeight(60);



        additionBtn=new Button("+");
        additionBtn.setPrefWidth(120);
        additionBtn.setPrefHeight(60);


        HB5=new HBox(oneBtn,twoBtn,threeBtn,additionBtn);
        HB5.setAlignment(Pos.CENTER);

        addSubBtn=new Button("+/-");
        addSubBtn.setPrefWidth(120);
        addSubBtn.setPrefHeight(60);

        zeroBtn=new Button("0");
        zeroBtn.setPrefWidth(120);
        zeroBtn.setPrefHeight(60);

        dotBtn=new Button(".");

        dotBtn.setPrefWidth(120);
        dotBtn.setPrefHeight(60);


        isEqualBtn=new Button("=");
        isEqualBtn.setPrefWidth(120);
        isEqualBtn.setPrefHeight(60);

        getValues value=new getValues();
        zeroBtn.setOnAction(value);
        oneBtn.setOnAction(value);
        twoBtn.setOnAction(value);
        threeBtn.setOnAction(value);
        fourBtn.setOnAction(value);
        fiveBtn.setOnAction(value);
        sixBtn.setOnAction(value);
        sevenBtn.setOnAction(value);
        eightBtn.setOnAction(value);
        nineBtn.setOnAction(value);

        actionHandler action=new actionHandler();
        divisionBtn.setOnAction(action);
        multiplicationBtn.setOnAction(action);
        additionBtn.setOnAction(action);
        minusBtn.setOnAction(action);

        EqualHandler handler=new EqualHandler();
        isEqualBtn.setOnAction(handler);

        calculationHandler cal=new calculationHandler();
        cBtn.setOnAction(cal);
        sqrtBtn.setOnAction(cal);
        sqrBtn.setOnAction(cal);

        HB6=new HBox(addSubBtn,zeroBtn,dotBtn,isEqualBtn);
        HB6.setAlignment(Pos.CENTER);
        root=new FlowPane(tfDisplay,HB1,HB2,HB3,HB4,HB5,HB6);
        root.setOrientation(Orientation.VERTICAL);
        root.setAlignment(Pos.CENTER);
        Scene scene=new Scene(root,480,360);

        primaryStage.setTitle("181380006 CALCULATOR");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private  class getValues implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==oneBtn)
            {
                str=str+"1";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==twoBtn)
            {
                str=str+"2";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==threeBtn)
            {
                str=str+"3";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==fourBtn)
            {
                str=str+"4";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==fiveBtn)
            {
                str=str+"5";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==sixBtn)
            {
                str=str+"6";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==sevenBtn)
            {
                str=str+"7";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==eightBtn)
            {
                str=str+"8";
                tfDisplay.setText(str);
            }
            else if(event.getSource()==nineBtn)
            {
                str=str+"9";
                tfDisplay.setText(str);
            }
            else if (event.getSource()==zeroBtn)
            {
                str=str+"0";
                tfDisplay.setText(str);
            }



        }
    }
    private class actionHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==divisionBtn)
            {
                value=Integer.parseInt(tfDisplay.getText().toString());
                str="";
                str1="division";
                tfDisplay.setText(null);
            }
            else if (event.getSource()==multiplicationBtn)
            {
                value=Integer.parseInt(tfDisplay.getText().toString());
                str="";
                str1="multiplication";
                tfDisplay.setText(null);
            }
            else if (event.getSource()==additionBtn)
            {
                value=Integer.parseInt(tfDisplay.getText().toString());
                str="";
                str1="add";
                tfDisplay.setText(null);
            }
            else if (event.getSource()==minusBtn)
            {
                value=Integer.parseInt(tfDisplay.getText().toString());
                str="";
                str1="minus";
                tfDisplay.setText(null);
            }


        }


    }

    private class EqualHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {

            if(str1.equals("division"))
            {
                value2=Integer.parseInt(tfDisplay.getText().toString());
                tfDisplay.setText(Integer.toString(value/value2));
            }
            else if (str1.equals("multiplication"))
            {
                value2=Integer.parseInt(tfDisplay.getText().toString());
                tfDisplay.setText(Integer.toString(value*value2));
            }
            else if (str1.equals("addition"))
            {
                value2=Integer.parseInt(tfDisplay.getText().toString());
                tfDisplay.setText(Integer.toString(value+value2));
            }
            else if (str1.equals("minus"))
            {
                value2=Integer.parseInt(tfDisplay.getText().toString());
                tfDisplay.setText(Integer.toString(value-value2));
            }
        }
    }

    private class calculationHandler implements EventHandler<ActionEvent>
    {
        double  v,number;
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == cBtn) {
                tfDisplay.setText("0");
                value = 0;
                value2 = 0;
                str = "";
                str1 = "";
            } else if (event.getSource() == sqrBtn) {
                value = Integer.parseInt(tfDisplay.getText().toString());
                value = value * value;
                tfDisplay.setText(Integer.toString(value));
            } else if (event.getSource() == sqrtBtn) {
                value = Integer.parseInt(tfDisplay.getText().toString());
                value3 = Math.sqrt(value);
                tfDisplay.setText(Double.toString(value3));

            } else if (event.getSource() == isEqualBtn) {
                if (str1.equals("divide")) {
                  number =getDouble(tfDisplay);
                    String n = value2 / value + "";
                    if (n.equalsIgnoreCase("Infinity")) {
                        tfDisplay.setText("Error");
                    } else
                        tfDisplay.setText(setResultOfTextField(value / value2));


                }
            }
        }
        public  double getDouble(TextField tfDisplay){
            return Double.parseDouble(tfDisplay.getText().toString());
        }
            public String setResultOfTextField( double v)
            {
                return v + "";
            }


        }
    public static void main(String[] args) {
        launch(args);
    }
}