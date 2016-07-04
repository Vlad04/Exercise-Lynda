#include <stdlib.h>
#include <stdio.h>

struct my_node{
	int var;
	struct my_node *next;
	struct my_node *prev;
};

struct my_node *create_node(int value){

	struct my_node *node_n = (struct my_node *)malloc(sizeof(struct my_node));
	node_n->var=value;
	node_n->next=NULL;
	return node_n;
}

struct my_node* head; 


void add_node_head(int val) {
	struct my_node* new_node;
	new_node = create_node(val);
	if(head == NULL) {
		head = new_node;
		return;
	}
	head->prev = new_node;
	new_node->next = head; 
	head = new_node;
}


void add_node_tail(int val ) {
	struct my_node* temp = head;
	struct my_node* new_node = create_node(val);
	if(head == NULL) {
		head = new_node;
		return;
	}
	while(temp->next != NULL){
		temp = temp->next; 
	}
	temp->next = new_node;
	new_node->prev = temp;
}


void print_head() {
	struct my_node* temp = head;
	printf("En frente: ");
	while(temp != NULL) {
		printf("%d ",temp->var);
		temp = temp->next;
	}
	printf("\n");
}


void print_tail() {
	struct my_node* temp = head;
	if(temp == NULL){
		return;
	} 

	while(temp->next != NULL) {
		temp = temp->next;
	}

	printf("Detras: ");
	while(temp != NULL) {
		printf("%d ",temp->var);
		temp = temp->prev;
	}
	printf("\n");
}

int main() {

	
	head = NULL; //empezamos con una lista vacia
	
	
	add_node_tail(2); print_head(); print_tail();
	add_node_tail(1); print_head(); print_tail();
	add_node_head(3); print_head(); print_tail();
	add_node_tail(0); print_head(); print_tail();
}
