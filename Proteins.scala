package genes

object Proteins extends Enumeration {
  type AminoAcid = Value
  val Alanine, Arginine, Asparagine, Aspartate, Cysteine, Glutamate, Glutamine, Glycine, Histidine, Isoleucine, Leucine,
  Lysine, Methionine, Phenylalanine, Proline, Serine, Threonine, Tryptophan, Tyrosine, Valine, Stop = Value

  val aminoAcidInitials: Map[String, AminoAcid] = Map(
    "MET" -> Methionine,
    "LYS" -> Lysine,
    "CYS" -> Cysteine,
    "ARG" -> Arginine,
    "THR" -> Threonine,
    "PRO" -> Proline,
    "ASN" -> Asparagine,
    "TRP" -> Tryptophan,
    "GLU" -> Glutamate,
    "VAL" -> Valine,
    "GLN" -> Glutamine,
    "SER" -> Serine,
    "GLY" -> Glycine,
    "LEU" -> Leucine,
    "ILE" -> Isoleucine,
    "TYR" -> Tyrosine,
    "PHE" -> Phenylalanine,
    "HIS" -> Histidine,
    "ALA" -> Alanine,
    "ASP" -> Aspartate,
    "STOP" -> Stop
  ).withDefaultValue(null)

  import NucleicAcids.MRNA._

  val translation: Map[(RnaBase, RnaBase, RnaBase), AminoAcid] = Map(
    (Adenine, Adenine, Adenine) -> Lysine,
    (Adenine, Adenine, Cytosine) -> Asparagine,
    (Adenine, Adenine, Guanine) -> Lysine,
    (Adenine, Adenine, Uracil) -> Asparagine,
    (Adenine, Cytosine, Adenine) -> Threonine,
    (Adenine, Cytosine, Cytosine) -> Threonine,
    (Adenine, Cytosine, Guanine) -> Threonine,
    (Adenine, Cytosine, Uracil) -> Threonine,
    (Adenine, Guanine, Adenine) -> Arginine,
    (Adenine, Guanine, Cytosine) -> Serine,
    (Adenine, Guanine, Guanine) -> Arginine,
    (Adenine, Guanine, Uracil) -> Serine,
    (Adenine, Uracil, Adenine) -> Isoleucine,
    (Adenine, Uracil, Cytosine) -> Isoleucine,
    (Adenine, Uracil, Guanine) -> Methionine,
    (Adenine, Uracil, Uracil) -> Isoleucine,
    (Cytosine, Adenine, Adenine) -> Glutamine,
    (Cytosine, Adenine, Cytosine) -> Histidine,
    (Cytosine, Adenine, Guanine) -> Glutamine,
    (Cytosine, Adenine, Uracil) -> Histidine,
    (Cytosine, Cytosine, Adenine) -> Proline,
    (Cytosine, Cytosine, Cytosine) -> Proline,
    (Cytosine, Cytosine, Guanine) -> Proline,
    (Cytosine, Cytosine, Uracil) -> Proline,
    (Cytosine, Guanine, Adenine) -> Arginine,
    (Cytosine, Guanine, Cytosine) -> Arginine,
    (Cytosine, Guanine, Guanine) -> Arginine,
    (Cytosine, Guanine, Uracil) -> Arginine,
    (Cytosine, Uracil, Adenine) -> Leucine,
    (Cytosine, Uracil, Cytosine) -> Leucine,
    (Cytosine, Uracil, Guanine) -> Leucine,
    (Cytosine, Uracil, Uracil) -> Leucine,
    (Guanine, Adenine, Adenine) -> Glutamate,
    (Guanine, Adenine, Cytosine) -> Aspartate,
    (Guanine, Adenine, Guanine) -> Glutamate,
    (Guanine, Adenine, Uracil) -> Aspartate,
    (Guanine, Cytosine, Adenine) -> Alanine,
    (Guanine, Cytosine, Cytosine) -> Alanine,
    (Guanine, Cytosine, Guanine) -> Alanine,
    (Guanine, Cytosine, Uracil) -> Alanine,
    (Guanine, Guanine, Adenine) -> Glycine,
    (Guanine, Guanine, Cytosine) -> Glycine,
    (Guanine, Guanine, Guanine) -> Glycine,
    (Guanine, Guanine, Uracil) -> Glycine,
    (Guanine, Uracil, Adenine) -> Valine,
    (Guanine, Uracil, Cytosine) -> Valine,
    (Guanine, Uracil, Guanine) -> Valine,
    (Guanine, Uracil, Uracil) -> Valine,
    (Uracil, Adenine, Adenine) -> Stop,
    (Uracil, Adenine, Cytosine) -> Tyrosine,
    (Uracil, Adenine, Guanine) -> Stop,
    (Uracil, Adenine, Uracil) -> Tyrosine,
    (Uracil, Cytosine, Adenine) -> Serine,
    (Uracil, Cytosine, Cytosine) -> Serine,
    (Uracil, Cytosine, Guanine) -> Serine,
    (Uracil, Cytosine, Uracil) -> Serine,
    (Uracil, Guanine, Adenine) -> Stop,
    (Uracil, Guanine, Cytosine) -> Cysteine,
    (Uracil, Guanine, Guanine) -> Tryptophan,
    (Uracil, Guanine, Uracil) -> Cysteine,
    (Uracil, Uracil, Adenine) -> Leucine,
    (Uracil, Uracil, Cytosine) -> Phenylalanine,
    (Uracil, Uracil, Guanine) -> Leucine,
    (Uracil, Uracil, Uracil) -> Phenylalanine
  ).withDefaultValue(null)
}