import React from 'react';
import './Keyboard.css';

// TODO Work with decimal, percentange, root

const Keyboard = ({ result, setResult }) => {
    const onAddNumbers = (num) => {
        if (result === '0') {
            if (num !== '0') {
                setResult('' + num);
            }
            return;
        }
        setResult('' + result + num);
    };

    const onBackPress = () => {
        if (result.length === 1) {
            setResult('0');
            return;
        }
        setResult('' + result.substring(0, result.length - 1));
    };

    const onAddOperator = (op) => {
        if (result !== '0') {
            let lastOp = result[result.length - 1];
            if (
                lastOp === '+' ||
                lastOp === '-' ||
                lastOp === '*' ||
                lastOp === '/'
            ) {
                return;
            }
            setResult('' + result + op);
        }
    };

    const calculateResult = () => {
        let res = eval(result);
        setResult('' + res);
    };

    const onAddDecimal = () => {};

    return (
        <div className='Keyboard'>
            <div
                onClick={() => setResult('0')}
                className='Keyboard-button back'
            >
                C
            </div>
            <div onClick={onBackPress} className='Keyboard-button back'>
                ←
            </div>
            <div className='Keyboard-button operators'>√</div>
            <div
                onClick={() => onAddOperator('/')}
                className='Keyboard-button operators'
            >
                /
            </div>

            <div onClick={() => onAddNumbers(1)} className='Keyboard-button'>
                1
            </div>
            <div onClick={() => onAddNumbers(2)} className='Keyboard-button'>
                2
            </div>
            <div onClick={() => onAddNumbers(3)} className='Keyboard-button'>
                3
            </div>
            <div
                onClick={() => onAddOperator('*')}
                className='Keyboard-button operators'
            >
                *
            </div>

            <div onClick={() => onAddNumbers(4)} className='Keyboard-button'>
                4
            </div>
            <div onClick={() => onAddNumbers(5)} className='Keyboard-button'>
                5
            </div>
            <div onClick={() => onAddNumbers(6)} className='Keyboard-button'>
                6
            </div>
            <div
                onClick={() => onAddOperator('+')}
                className='Keyboard-button operators'
            >
                +
            </div>

            <div onClick={() => onAddNumbers(7)} className='Keyboard-button'>
                7
            </div>
            <div onClick={() => onAddNumbers(8)} className='Keyboard-button'>
                8
            </div>
            <div onClick={() => onAddNumbers(9)} className='Keyboard-button'>
                9
            </div>
            <div
                onClick={() => onAddOperator('-')}
                className='Keyboard-button operators'
            >
                -
            </div>

            <div onClick={() => onAddNumbers(0)} className='Keyboard-button'>
                0
            </div>
            <div className='Keyboard-button'>.</div>
            <div className='Keyboard-button operators'>%</div>
            <div onClick={calculateResult} className='Keyboard-button equal'>
                =
            </div>
        </div>
    );
};

export default Keyboard;
