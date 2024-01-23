import java.util.Objects;

public class Laptop {
    private String name;
    private String cpu;
    private int memory;
    private String gpu;
    private int ram;
    private String os;
    private String color;

    public Laptop(String name, String cpu, int memory, String gpu, int ram, String os, String color) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
        this.gpu = gpu;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Название модели: '" + name + '\'' +
                ", процессор: " + cpu +
                ", объем памяти: '" + memory + '\'' +
                ", видеокарта: '" + gpu + '\'' +
                ", объем оперативной памяти: '" + ram + '\'' +
                ", операционная система: '" + os + '\'' +
                ", цвет: '" + color + '\'';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return name.equals(laptop.name) && cpu.equals(laptop.cpu) && memory == laptop.memory && gpu.equals(laptop.gpu) &&
                ram == laptop.ram && os.equals(laptop.os) && color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpu, memory, gpu, ram, os, color);
    }
}