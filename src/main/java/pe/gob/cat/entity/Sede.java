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
@Table(name = "SEDE", schema = "public")
public class Sede {
	
	@Id 
	@SequenceGenerator(name="idSequence",    sequenceName="seq_Sede",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="idSequence")
	@Column (name = "coSede")
	private int coSede;
	@Column (name = "deSede")
	private String deSede;
	
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

