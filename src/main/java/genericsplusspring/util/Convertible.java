package genericsplusspring.util;

// Basicamente interface responsável por converter um tipo "T"
// Uma classe vai ser convertivel para o tipo "T", se ela tiver um metodo que chama "convert()" que
// leva um tipo "T"
public interface Convertible<T> {
	
	T convert();
}
