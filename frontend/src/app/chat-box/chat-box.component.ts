import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {MessageService} from '../services/message.service';
import {Message} from '../models/message';

@Component({
  selector: 'app-chat-box',
  templateUrl: './chat-box.component.html',
  styleUrls: ['./chat-box.component.css']
})
export class ChatBoxComponent implements OnInit {

  message: Message;
  response: Message[];
  history: Message[][];

  constructor(private route: ActivatedRoute,
              private router: Router,
              private messageService: MessageService) {
    this.history = [];
  }

  ngOnInit() {
    let msg = new Message();
    msg.text = "start_assistant";
    this.messageService.sendMessage(msg).subscribe(result => {
      this.response = result;
      this.response.map(x => x.owner = "Watson");
      this.history.push(this.response);
    });

  }

  onSubmit(query: string) {

    this.message = new Message();
    this.message.response_type = 'text';
    this.message.text = query;
    this.message.owner = 'User';

    this.history.push([this.message]);

    this.messageService.sendMessage(this.message).subscribe(result => {

      this.response = result;
      this.response.map(x => x.owner = "Watson");
      this.history.push(this.response);
      console.log(this.history);
    });

  }

}
