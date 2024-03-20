module com.valeriaguzman.proyectoprogramacioni {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.valeriaguzman.proyectoprogramacioni to javafx.fxml;
    exports com.valeriaguzman.proyectoprogramacioni;
}
