module com.valeriaguzman.proyectoprogramacioni {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.valeriaguzman.proyectoprogramacioni to javafx.fxml;
    exports com.valeriaguzman.proyectoprogramacioni;
}
