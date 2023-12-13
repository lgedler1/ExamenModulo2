package examenModulo2.parte4;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "TB_CONTRATO")
public class Contrato {
//	id (Identificador numérico, clave primaria)
//	nombreCliente (Cadena de texto)
//	fechaInicio (Fecha de inicio del contrato)
//	fechaFin (Fecha de fin del contrato)
//	importe (Valor numérico representando el importe del contrato)
//
//	Realiza las siguientes operaciones de consulta utilizando Hibernate:
//
//	+ Insertar 3 contratos donde la fecha de inicio sea el dia actual y la fecha fin sea: para el primero el 31/12/2023, para el segundo 31/12/2024 y para el tercero 31/12/2025 (2 puntos)
//	+ Recuperar todos los contratos almacenados en la base de datos. (1 puntos)
//	+ Buscar contratos por nombre de cliente. (2 puntos)
//	+ Obtener contratos que finalicen después del 10/10/2024. (2 puntos)
//	+ Encontrar contratos cuyo importe sea superior a cierto valor solicitado. (2 puntos)
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private Long id;
		@Column(length = 50, name = "NOMBRE_CLIENTE", nullable = false)
		private String nombre;
		
		private Date fecha_Inicio;
		
		private Date fecha_Final;
		
		@Column( name = "IMPORTE_CONTRATO", nullable = false)
		private int importe;

		public Contrato() {
			super();
		}

		public Contrato(Long id, String nombre, Date fecha_Inicio, Date fecha_Final, int importe) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.fecha_Inicio = fecha_Inicio;
			this.fecha_Final = fecha_Final;
			this.importe = importe;
		}

		public Contrato(Long id, String nombre, Date fecha_Inicio, int importe) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.fecha_Inicio = fecha_Inicio;
			this.importe = importe;
		}

		public final Long getId() {
			return id;
		}

		public final void setId(Long id) {
			this.id = id;
		}

		public final String getNombre() {
			return nombre;
		}

		public final void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public final Date getFecha_Inicio() {
			return fecha_Inicio;
		}

		public final void setFecha_Inicio(Date fecha_Inicio) {
			this.fecha_Inicio = fecha_Inicio;
		}

		public final Date getFecha_Final() {
			return fecha_Final;
		}

		public final void setFecha_Final(Date fecha_Final) {
			this.fecha_Final = fecha_Final;
		}

		public final int getImporte() {
			return importe;
		}

		public final void setImporte(int importe) {
			this.importe = importe;
		}

		@Override
		public String toString() {
			return "Contrato [id=" + id + ", nombre=" + nombre + ", fecha_Inicio=" + fecha_Inicio + ", fecha_Final="
					+ fecha_Final + ", importe=" + importe + "]";
		}
		
		

		



	
}
