import React from 'react';
import './Result.css';

const Result = ({ result }) => {
    return (
        <div className='Result'>
            <p className='Result-text'>{result}</p>
        </div>
    );
};

export default Result;
