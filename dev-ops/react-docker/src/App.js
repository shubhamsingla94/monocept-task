import React, { Fragment, useState } from 'react';
import Heading from './components/Heading';
import Result from './components/Result';
import Keyboard from './components/Keyboard';

const App = () => {
    const [result, setResult] = useState('0');

    return (
        <Fragment>
            <Heading text={'Calculator'} />
            <Result result={result} />
            <Keyboard result={result} setResult={setResult} />
        </Fragment>
    );
};

export default App;
