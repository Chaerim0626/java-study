package generics;

public class ThreeDPrinter<T> {
	
	private T material; //object로 변환해 사용

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}

	
	
}
