package decorator_design_pattern_java;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }
}
