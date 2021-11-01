import React from 'react';
import './Heading.css';

const Heading = ({ text }) => {
    return (
        <div className='Heading'>
            <div className='Heading-card'>
                <h1 className='Heading-text'>{text}</h1>
            </div>
        </div>
    );
};

export default Heading;
