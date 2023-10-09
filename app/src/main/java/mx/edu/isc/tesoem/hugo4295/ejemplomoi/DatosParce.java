package mx.edu.isc.tesoem.hugo4295.ejemplomoi;

import android.os.Parcel;
import android.os.Parcelable;

public class DatosParce implements Parcelable {
    String nombre, edad, correo;

    public DatosParce() {
    }

    public DatosParce(String nombre, String edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    protected DatosParce(Parcel in) {
        nombre = in.readString();
        edad = in.readString();
        correo = in.readString();
    }

    public static final Creator<DatosParce> CREATOR = new Creator<DatosParce>() {
        @Override
        public DatosParce createFromParcel(Parcel in) {
            return new DatosParce(in);
        }

        @Override
        public DatosParce[] newArray(int size) {
            return new DatosParce[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(edad);
        parcel.writeString(correo);
    }
}
