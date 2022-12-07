package pe.gob.cat.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "PERSONA", schema = "public")
public class Persona {
	
	@Id 
	@SequenceGenerator(name="idSequence",    sequenceName="seq_persona",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="idSequence")
	@Column (name = "copersona")
	private int coPersona;
	@Column (name = "coTipoDocumento")
	private int coTipoDocumento;
	@Column (name = "numeroDocumento")
	private String numeroDocumento;
	@Column (name = "apellidoPaterno")
	private String apellidoPaterno;
	@Column (name = "apellidoMaterno")
	private String apellidoMaterno;
	@Column (name = "nombres")
	private String nombres;
	@Column (name = "sexo")
	private int sexo;
	@Column (name = "fechaNacimiento")
	private String fechaNacimiento;
	@Column (name = "esRegistro")
	private int esRegistro;
	@Column (name = "usuarioCreacion")
	private String usuarioCreacion;
	@Column (name = "fechaCreacion")
	private Date fechaCreacion;
	@Column (name = "ipCreacion")
	private String ipCreacion;
	@Column (name = "usuarioModificacion")
	private String usuarioModificacion;
	@Column (name = "fechamodificacion")
	private Date fechaModificacion;
	@Column (name = "ipmodificacion")
	private String ipModificacion;	

	
}

