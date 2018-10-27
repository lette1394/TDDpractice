package BowlingScore.Render;

class Bottom implements Renderable {
    private Bottom() {}

    static Bottom create() {
        return new Bottom();
    }

    @Override
    public String renderCeiling() {
        return "       ";
    }

    @Override
    public String renderContents() {
        return String.format("%3s%s%3s", "", "1", "");
    }

    @Override
    public String renderFloor() {
        return renderCeiling();
    }
}
