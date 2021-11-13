import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primeiro-componente',
  templateUrl: 'primeiro.component.html',
  styleUrls: ['primeiro.component.scss']
})

export class PrimeiroComponent implements OnInit {

  itemCount: number;
  todoItemText: string = '';
  todoItems = [];



  ngOnInit() {
    this.itemCount = this.todoItems.length;
  }

  addTodoItem() {
    alert();
    this.todoItems.push(this.todoItemText);
    this.todoItemText = '';
    this.itemCount = this.todoItems.length;
  }

  empresa = 'Minha Empresa';

}
