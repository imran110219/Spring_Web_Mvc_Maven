import React, { Component } from 'react';

class Counter extends Component {
    state = {
        count: 1,
        tags: ['tag1', 'tag2', 'tag3']
    };

    styles = {
        fontSize: 50,
        fontWeight: 'bold'
    }


    render() { 
        return (
            <div>
                <span className={this.getBadgeClasses()}>{this.formatCount()}</span>
                <button className="btn btn-secondary btn-sm">Increment</button>
                <ul>
        { this.state.tags.map(tag => <li key={tag.id}>{ tag }</li>) }
                </ul>
            </div>
        );
    }
}

export default Counter;