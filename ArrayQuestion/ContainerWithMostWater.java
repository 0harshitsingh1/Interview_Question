package ArrayQuestion;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxheight = 0;

        while (left < right) {
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;

            maxheight = Math.max(maxheight, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxheight;
    }

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.print("Height: ");
        for (int num : height) {

            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(containerWithMostWater.maxArea(height));

    }
}
