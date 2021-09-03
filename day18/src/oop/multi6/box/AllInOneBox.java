package oop.multi6.box;

	public class AllInOneBox <E> {
		
		private E value;
		
		public void setValue(E value) {
			this.value = value;
		}
		
		public E getValue() {
			return this.value;
		}
}
