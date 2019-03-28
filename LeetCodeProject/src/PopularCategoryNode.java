import java.util.ArrayList;

public class PopularCategoryNode {
	
	public static void main(String[] args) {
		CategoryNode node = new CategoryNode();
		
	}
	//int max =0;
	public CategoryNode getMostPopularNode(CategoryNode node){
		if(node == null) {
			return null;
		}
		
		return getMostPopularNodeUtil(node, new CategoryNode(Integer.MIN_VALUE));
	}

	private CategoryNode getMostPopularNodeUtil(CategoryNode node, CategoryNode max) {
		int sum = 0;
	    int count =0;
	    if(node.subCategoryNode.size() == 0)
	        return node;
	    for(CategoryNode categoryNode : node.subCategoryNode){
	        if(categoryNode.subCategoryNode.size() > 0){
	            CategoryNode tmp = getMostPopularNodeUtil(categoryNode,max);
	            if(tmp.value>max.value){
	                max.value = tmp.value;
	            }
	        }
	        sum+=categoryNode.value;
	        count++;
	    }
	    sum = sum/count;
	    if(sum>max.value)
	        max.value = sum;
	    return max;	
	}
	
}

class CategoryNode{
	int value;
	ArrayList<CategoryNode> subCategoryNode;
	CategoryNode(){
		this.subCategoryNode = new ArrayList<CategoryNode>();
	}
	public CategoryNode(int minValue) {
		this.value = minValue;
		this.subCategoryNode = new ArrayList<CategoryNode>();
	}
	
}
