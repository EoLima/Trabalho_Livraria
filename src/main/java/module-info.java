module com.example.bibliotecajavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    requires lombok;

    requires org.hibernate.orm.core;
    requires jakarta.persistence;

    opens com.livraria.model to org.hibernate.orm.core;
    opens com.livraria to javafx.fxml;
    opens com.livraria.controller to javafx.fxml;

    exports com.livraria;
    exports com.livraria.model;
}
