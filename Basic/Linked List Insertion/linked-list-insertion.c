//{ Driver Code Starts
//Initial Template for C

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};


// } Driver Code Ends
//User function Template for C

//Function to insert a node at the begin of the linked list.
struct Node *insertAtBegining(struct Node *head, int x) {
struct Node *new_node=(struct Node*)malloc(sizeof(struct Node));
new_node->data=x;
new_node->next=head;

return new_node;
	//code here
}


//Function to insert a node at the end of the linked list.
struct Node *insertAtEnd(struct Node *head, int x)  {
struct Node *new_node = (struct Node*)malloc(sizeof(struct Node));
struct Node *temp = head;
    new_node->data=x;
      
    new_node->next = NULL;
    
    if(head==NULL){
        head=new_node;
        return;
        
    }else{
    while(temp->next!=NULL){
        temp=temp->next;
        
    }
    temp->next=new_node;
	//code here
}
return head;

}
//{ Driver Code Starts.

void printList(struct Node* node)
{
	while (node != NULL) {
		printf("%d ", node->data);
		node = node->next;
	}
	printf("\n");
}

int main(){
    
    int t;
    scanf("%d", &t);
    while (t--)
	{
    	int n;
    	scanf("%d", &n);
		struct Node *head = NULL;
		for (int i = 0; i < n; ++i)
		{
			int data, indicator;
			scanf("%d", &data);
			scanf("%d", &indicator);
			if (indicator)
				head = insertAtEnd(head, data);
			else
				head = insertAtBegining(head, data);
		}
		printList(head);
	}
	return 0;
}
// } Driver Code Ends