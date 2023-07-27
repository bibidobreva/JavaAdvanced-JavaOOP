package magicGame.repositories.interfaces;

import magicGame.models.magicians.Magician;

import java.util.ArrayList;

import java.util.List;

import static magicGame.common.ExceptionMessages.INVALID_MAGICIAN_REPOSITORY;

public class MagicianRepositoryImpl implements MagicianRepository {
    private List<Magician> data;

    public MagicianRepositoryImpl() {
        this.data = new ArrayList<>();
    }

    @Override
    public List<Magician> getData() {
        return this.data;
    }

    @Override
    public void addMagician(Magician model) {
        if (model == null) {
            throw new NullPointerException(INVALID_MAGICIAN_REPOSITORY);
        }
        data.add(model);
    }

    @Override
    public boolean removeMagician(Magician model) {
        if(data.contains(model)){
            data.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public Magician findByUsername(String name) {
        for (Magician dataMagician : data) {
            if(dataMagician.getUsername().equals(name)){
                return dataMagician;
            }
        }
        return null;
    }
}
